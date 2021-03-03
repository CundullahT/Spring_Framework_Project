package com.cybertek.aspects;

import com.cybertek.controller.ProductController;
import com.cybertek.entity.Product;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.hibernate.mapping.Join;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Aspect
@Configuration
public class LoggingAspect {

    Logger logger = LoggerFactory.getLogger(ProductController.class);
//
//    @Pointcut("execution(* com.cybertek.controller.ProductController.*(..))")
//    public void pointcut() {
//    }
//
//    @Before("pointcut()")
//    public void log() {
//        logger.info("-------------");
//    }
//
//
//    @Before("execution(* com.cybertek.controller.ProductController.*(..))")
//    public void beforeAdvice() {
//        logger.info("-----------");
//    }
//
//
//    // execution
//
//    @Pointcut("execution(* com.cybertek.controller.ProductController.up*(..))")
//    private void anyUpdateOperation(){}
//
//    @Pointcut("execution(* com.cybertek.repository.ProductRepository.findById(Long))")
//    private void anyProductRepositoryFindById(){}
//
//    @Before("anyProductRepositoryFindById()")
//    public void beforeProductRepoAdvice(JoinPoint joinPoint){
//        logger.info("Before(findById) -> Method {} - Arguments : {} - Target : {}",joinPoint,joinPoint.getArgs(),joinPoint.getTarget());
//    }
//
//    @Before("anyUpdateOperation()")
//    public void beforeControllerAdvice(JoinPoint joinPoint){
//        logger.info("Before -> Method {} - Arguments : {} - Target : {}",joinPoint,joinPoint.getArgs(),joinPoint.getTarget());
//    }
//
//    // within
//
//    @Pointcut("within(com.cybertek.controller..*)")
//    private void anyControllerOperation() {
//    }
//
//    @Pointcut("@within(org.springframework.stereotype.Service)")
//    private void anyServiceAnnotatedOperation() {
//    }
//
//    @Before("anyServiceAnnotatedOperation() || anyControllerOperation() ")
//    public void beforeControllerAdvice2(JoinPoint joinPoint) {
//        logger.info("Before -> Method : {} - Arguments : {} - Target : {}", joinPoint, joinPoint.getArgs(), joinPoint.getTarget());
//    }
//
//    // annotation
//
//    @Pointcut("@annotation(org.springframework.web.bind.annotation.DeleteMapping)")
//    private void anyDeleteProductOperation() {
//    }
//
//    @Before("anyDeleteProductOperation()")
//    public void beforeControllerAdvice(JoinPoint joinPoint) {
//        logger.info("Before -> Method : {} - Arguments : {} - Target : {}", joinPoint, joinPoint.getArgs(), joinPoint.getTarget());
//    }
//
//    // after returning
//
//    @Pointcut("@annotation(org.springframework.web.bind.annotation.GetMapping)")
//    private void anyGetProductOperation() {
//    }
//
//    @AfterReturning(pointcut = "anyGetProductOperation()", returning = "results")
//    public void afterReturningControllerAdvice(JoinPoint joinPoint, Product results) {
//        logger.info("After Returning(Mono Result) -> Method : {} - results :{}", joinPoint.getSignature().toShortString(), results);
//    }
//
//    @AfterReturning(pointcut = "anyGetProductOperation()", returning = "results")
//    public void afterReturningControllerAdvice2(JoinPoint joinPoint, List<Product> results) {
//        logger.info("After Returning(List Result) -> Method : {} - results :{}", joinPoint.getSignature().toShortString(), results);
//    }
//
    // after throwing
//
//    @Pointcut("@annotation(org.springframework.web.bind.annotation.GetMapping)")
//    private void anyGetPutProductOperation() {
//    }
//
//    @AfterThrowing(pointcut = "anyGetPutProductOperation()", throwing = "exception")
//    public void afterThrowingControllerAdvice(JoinPoint joinPoint, Exception exception) {
//        logger.info("After Throwing(Send Email to L2 Team) -> Method: {} - Exception : {}", joinPoint.getSignature().toShortString(), exception.getMessage());
//    }
//
    // after

    @Pointcut("@annotation(org.springframework.web.bind.annotation.GetMapping)")
    private void anyGetPutProductOperation2(){}

    @After("anyGetPutProductOperation2()")
    public void afterControllerAdvice(JoinPoint joinPoint){
        logger.info("After finally -> Method: {} - results: {}", joinPoint.getSignature().toShortString());
    }

    @Pointcut("@annotation(org.springframework.web.bind.annotation.PostMapping)")
    private void anyPostProductOperation(){}

    @Pointcut("@annotation(org.springframework.web.bind.annotation.PutMapping)")
    private void anyPutProductOperation(){}

    @Around("anyPostProductOperation()")
    public Object anyPostControllerAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        logger.info("Before -> Method: {} - Parameters: {}", proceedingJoinPoint.getSignature().toShortString(), proceedingJoinPoint.getArgs());

        List<Product> results = new ArrayList<>();
//        results = (List<Product>) proceedingJoinPoint.proceed();

        logger.info("After -> Method: {} - Results: {}", proceedingJoinPoint.getSignature().toShortString(), results);

        return results;

    }

}
