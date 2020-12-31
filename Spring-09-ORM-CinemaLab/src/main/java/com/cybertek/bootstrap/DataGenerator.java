package com.cybertek.bootstrap;

import com.cybertek.entity.*;
import com.cybertek.enums.MovieState;
import com.cybertek.enums.MovieType;
import com.cybertek.enums.UserRole;
import com.cybertek.repository.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DataGenerator {

    private final MovieRepository movieRepository;
    private final CinemaRepository cinemaRepository;
    private final GenreRepository genreRepository;
    private final UserRepository userRepository;
    private final MovieCinemaRepository movieCinemaRepository;
    private final TicketRepository ticketRepository;

    public DataGenerator(MovieRepository movieRepository, CinemaRepository cinemaRepository, GenreRepository genreRepository, UserRepository userRepository, MovieCinemaRepository movieCinemaRepository, TicketRepository ticketRepository) {
        this.movieRepository = movieRepository;
        this.cinemaRepository = cinemaRepository;
        this.genreRepository = genreRepository;
        this.userRepository = userRepository;
        this.movieCinemaRepository = movieCinemaRepository;
        this.ticketRepository = ticketRepository;
    }
    /**
     * User objects.
     */
    public User u1 = new User("josie_story@email.com", "123123123", "josieStory");
    public User u2 = new User("bernard@email.com", "123123123", "bernard");
    public User u3 = new User("faith.p@email.com", "123123123", "faith");
    public User u4 = new User("johnnie@email.com", "123123123", "johnnie");
    public User u5 = new User("lawrence.f@email.com", "123123123", "lawrence.f");
    /**
     * Cinema objects
     */
    public Cinema c1 = new Cinema("Hall 1 - EMPIRE", "McDonald");
    public Cinema c2 = new Cinema("Hall 2 - EMPIRE", "Kodak");
    public Cinema c3 = new Cinema("Hall 3 - EMPIRE", "Act Vision");
    public Cinema c4 = new Cinema("Hall 4 - EMPIRE", "Quick Vision");
    public Cinema c5 = new Cinema("Hall 1 - STREET 14", "Du Pont");
    public Cinema c6 = new Cinema("Hall 2 - STREET 14", "HBO");
    public Cinema c7 = new Cinema("Hall 3 - STREET 14", "MySpace");
    public Cinema c8 = new Cinema("Hall 4 - STREET 14", "PlayStation");
    public Cinema c9 = new Cinema("Hall 1 - SQUARE 13", "Walt Disney");
    public Cinema c10 = new Cinema("Hall 2 - SQUARE 13", "Sony Corporation");
    public Cinema c11 = new Cinema("Hall 3 - SQUARE 13", "Warner Bros");
    public Cinema c12 = new Cinema("Hall 4 - SQUARE 13", "PlayStation");
    public Cinema c13 = new Cinema("Hall 1 - VILLAGE 7", "Du Pont");
    public Cinema c14 = new Cinema("Hall 2 - VILLAGE 7", "Kodak");
    public Cinema c15 = new Cinema("Hall 3 - VILLAGE 7", "MySpace");
    public Cinema c16 = new Cinema("Hall 4 - VILLAGE 7", "Channel 4");
    /**
     * Movie Objects.
     */
    public Movie m1 = new Movie("The Gentleman", LocalDate.of(2020,1,24), 113, MovieType.REGULAR, MovieState.ACTIVE,new BigDecimal("20.00"));
    public Movie m2 = new Movie("A Beautiful Mind",LocalDate.of(2002,1,04),135, MovieType.REGULAR, MovieState.DRAFT,new BigDecimal("15.00"));
    public Movie m3 = new Movie("The Shawshank Redemption",LocalDate.of(1994,10,14),142, MovieType.REGULAR, MovieState.DRAFT,new BigDecimal("35.00"));
    public Movie m4 = new Movie("The Godfather",LocalDate.of(1972,3,24), 175, MovieType.REGULAR, MovieState.DRAFT,new BigDecimal("35.00"));
    public Movie m5 = new Movie("Tenet",LocalDate.of(2020,9,3), 150, MovieType.PREMIER, MovieState.ACTIVE,new BigDecimal("35.00"));
    public Movie m6 = new Movie("The Loss Adjuster",LocalDate.of(2020,12,29), 100, MovieType.PREMIER, MovieState.DRAFT,new BigDecimal("35.00"));
    public Movie m7 = new Movie("The Nights Before Christmas",LocalDate.of(2020,11,19), 100, MovieType.REGULAR, MovieState.ACTIVE,new BigDecimal("28.00"));
    public Movie m8 = new Movie("Spider-Man: Miles Morales",LocalDate.of(2020,12,12), 130, MovieType.REGULAR, MovieState.DRAFT,new BigDecimal("28.00"));
    public Movie m9 = new Movie("Avengers: Endgame",LocalDate.of(2019,4,26), 181, MovieType.REGULAR, MovieState.DRAFT,new BigDecimal("48.00"));

    /**
     * Movie Cinema objects.
     */
    public MovieCinema mc1 = new MovieCinema(LocalDateTime.of(2020,12,5,20,00));
    public MovieCinema mc2 = new MovieCinema(LocalDateTime.of(2020,12,5,19,00));
    public MovieCinema mc3 = new MovieCinema(LocalDateTime.of(2020,12,5,18,45));
    public MovieCinema mc4 = new MovieCinema(LocalDateTime.of(2020,12,5,18,45));
    public MovieCinema mc5 = new MovieCinema(LocalDateTime.of(2020,12,5,21,30));

    public MovieCinema mc6 = new MovieCinema(LocalDateTime.of(2020,12,6,20,00));
    public MovieCinema mc7 = new MovieCinema(LocalDateTime.of(2020,12,6,19,00));
    public MovieCinema mc8 = new MovieCinema(LocalDateTime.of(2020,12,6,18,00));
    public MovieCinema mc9 = new MovieCinema(LocalDateTime.of(2020,12,6,20,45));
    public MovieCinema mc10 = new MovieCinema(LocalDateTime.of(2020,12,6,21,30));

    public MovieCinema mc11 = new MovieCinema(LocalDateTime.of(2020,12,6,20,00));
    public MovieCinema mc12 = new MovieCinema(LocalDateTime.of(2020,12,6,19,00));
    public MovieCinema mc13 = new MovieCinema(LocalDateTime.of(2020,12,6,18,00));
    public MovieCinema mc14 = new MovieCinema(LocalDateTime.of(2020,12,6,20,45));
    public MovieCinema mc15 = new MovieCinema(LocalDateTime.of(2020,12,6,21,30));

    public MovieCinema mc16 = new MovieCinema(LocalDateTime.of(2020,12,6,20,00));
    public MovieCinema mc17 = new MovieCinema(LocalDateTime.of(2020,12,6,19,00));
    public MovieCinema mc18 = new MovieCinema(LocalDateTime.of(2020,12,6,18,00));
    public MovieCinema mc19 = new MovieCinema(LocalDateTime.of(2020,12,6,20,45));
    public MovieCinema mc20 = new MovieCinema(LocalDateTime.of(2020,12,6,21,30));

    public MovieCinema mc21 = new MovieCinema(LocalDateTime.of(2020,12,26,18,00));
    public MovieCinema mc22 = new MovieCinema(LocalDateTime.of(2020,12,26,20,00));
    public MovieCinema mc23 = new MovieCinema(LocalDateTime.of(2020,12,26,20,30));
    public MovieCinema mc24 = new MovieCinema(LocalDateTime.of(2020,12,26,18,30));
    public MovieCinema mc25 = new MovieCinema(LocalDateTime.of(2020,12,26,21,30));
    public MovieCinema mc26 = new MovieCinema(LocalDateTime.of(2020,12,26,19,00));
    public MovieCinema mc27 = new MovieCinema(LocalDateTime.of(2020,12,26,19,45));
    public MovieCinema mc28 = new MovieCinema(LocalDateTime.of(2020,12,26,22,00));

    Account a1 = new Account("Josie D Story", "262  Lochmere Lane", "United States", "Kentucky", "LOUISVILLE", 35, "40289", UserRole.USER);
    Account a2 = new Account("Bernard P Fendley", "2903  Jarvis Street", "United States", "New York", "Buffalo", 28, "14211", UserRole.USER);
    Account a3 = new Account("Faith R Parsons", "4161  Alfred Drive", "United States", "New York", "Brooklyn", 47, "11226", UserRole.USER);
    Account a4 = new Account("Johnnie J Cannon", "2587  Logan Lane", "United States", "New York", "HOLTSVILLE", 47, "00544", UserRole.USER);
    Account a5 = new Account("Lawrence E Folkerts", "698  Clark Street", "United States", "New York", "Brentwood", 47, "11717", UserRole.USER);

    Location l1 = new Location("AMC Empire 25",null,null, "10036","United States","New York", "New York","234 W 42nd St") ;
    Location l2 = new Location("AMC 34th Street 14",null,null, "10001", "United States", "New York", "New York","312 W 34th St");
    Location l3 = new Location("AMC Lincoln Square 13",null,null, "10023", "United States", "New York", "New York", "1998 Broadway");
    Location l4 = new Location("AMC Village 7",null,null, "10003", "United States", "New York", "New York", "66 3rd Ave");

    Genre g1 = new Genre("Comedy");
    Genre g2 = new Genre("Sci-Fi");
    Genre g3 = new Genre("Action");
    Genre g4 = new Genre("Horror");
    Genre g5 = new Genre("Thriller");
    Genre g6 = new Genre("Drama");
    Genre g7 = new Genre("Mystery");
    Genre g8 = new Genre("Crime");
    Genre g9 = new Genre("Animation");
    Genre g10 = new Genre("Adventure");
    Genre g11 = new Genre("History");
    Genre g12 = new Genre("Fantasy");
    Genre g13 = new Genre("Biography");

    Ticket t1 = new Ticket(15, 14, LocalDateTime.of(2020,12,5,20,00));
    Ticket t2 = new Ticket(7, 18, LocalDateTime.of(2020,12,5,20,00));
    Ticket t3 = new Ticket(9, 9, LocalDateTime.of(2020,12,5,20,00));
    Ticket t4 = new Ticket(18, 12, LocalDateTime.of(2020,12,5,20,00));
    Ticket t5 = new Ticket(5, 11, LocalDateTime.of(2020,12,5,20,00));

    Ticket t6 = new Ticket(15, 14, LocalDateTime.of(2020,12,6,20,45));
    Ticket t7 = new Ticket(7, 18, LocalDateTime.of(2020,12,6,20,45));
    Ticket t8 = new Ticket(9, 9, LocalDateTime.of(2020,12,6,20,45));
    Ticket t9 = new Ticket(18, 12, LocalDateTime.of(2020,12,6,20,45));
    Ticket t10 = new Ticket(5, 11, LocalDateTime.of(2020,12,6,20,45));

    Ticket t11 = new Ticket(15, 14, LocalDateTime.of(2020,12,7,21,30));
    Ticket t12 = new Ticket(7, 18, LocalDateTime.of(2020,12,7,21,30));
    Ticket t13 = new Ticket(9, 9, LocalDateTime.of(2020,12,7,21,30));
    Ticket t14 = new Ticket(18, 12, LocalDateTime.of(2020,12,7,21,30));
    Ticket t15 = new Ticket(5, 11, LocalDateTime.of(2020,12,7,21,30));

    Ticket t16 = new Ticket(15, 14, LocalDateTime.of(2020,12,8,19,00));
    Ticket t17 = new Ticket(7, 18, LocalDateTime.of(2020,12,8,19,00));
    Ticket t18 = new Ticket(9, 9, LocalDateTime.of(2020,12,8,19,00));
    Ticket t19 = new Ticket(18, 12, LocalDateTime.of(2020,12,8,19,00));
    Ticket t20 = new Ticket(5, 11, LocalDateTime.of(2020,12,8,19,00));

}
