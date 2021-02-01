INSERT INTO public.address (address_type, city, country, current_temperature, postal_code, state, street)
VALUES ('TEACHER', 'London', 'United Kingdom', null, '10000', null, 'Str. Garibaldi');
INSERT INTO public.address (address_type, city, country, current_temperature, postal_code, state, street)
VALUES ('PARENT', 'Paris', 'France', null, '10000', null, 'Str. Garibaldi');
INSERT INTO public.address (address_type, city, country, current_temperature, postal_code, state, street)
VALUES ('PARENT', 'Helsinki', 'Finland', null, '10000', null, 'Str. Luan Haradinaj');
INSERT INTO public.address (address_type, city, country, current_temperature, postal_code, state, street)
VALUES ('STUDENT', 'Berlin', 'Germany', null, '10000', null, 'Str. Mark Isaku');
INSERT INTO public.address (address_type, city, country, current_temperature, postal_code, state, street)
VALUES ('STUDENT', 'Athens', 'Greece', null, '10000', null, 'Str. Pjeter Bogdani');
INSERT INTO public.address (address_type, city, country, current_temperature, postal_code, state, street)
VALUES ('STUDENT', 'Budapest', 'Hungary', null, '10000', null, 'Str. Pjeter Bogdani');
INSERT INTO public.address (address_type, city, country, current_temperature, postal_code, state, street)
VALUES ('STUDENT', 'Amman', 'Jordan', null, '10000', null, 'Str. Luan Haradinaj');
INSERT INTO public.address (address_type, city, country, current_temperature, postal_code, state, street)
VALUES ('STUDENT', 'Kiev', 'Ukraine', null, '10000', null, 'Str. Garibaldi');
INSERT INTO public.address (address_type, city, country, current_temperature, postal_code, state, street)
VALUES ('STUDENT', 'New Delhi', 'India', null, '10000', null, 'Str. Pablo Neruda');
INSERT INTO public.address (address_type, city, country, current_temperature, postal_code, state, street)
VALUES ('PARENT', 'Dublin', 'Ireland', null, '10000', null, 'Str. Mark Isaku');
INSERT INTO public.address (address_type, city, country, current_temperature, postal_code, state, street)
VALUES ('PARENT', 'Nairobi', 'Kenya', null, '10000', null, 'Str. Pjeter Bogdani');
INSERT INTO public.address (address_type, city, country, current_temperature, postal_code, state, street)
VALUES ('PARENT', 'Bucharest', 'Romania', null, '10000', null, 'Str. Luan Haradinaj');
INSERT INTO public.address (address_type, city, country, current_temperature, postal_code, state, street)
VALUES ('PARENT', 'Bishkek', 'Kyrghyzstan', null, '10000', null, 'Str. Mark Isaku');
INSERT INTO public.address (address_type, city, country, current_temperature, postal_code, state, street)
VALUES ('STUDENT', 'Tripoli', 'Libya', null, '10000', null, 'Str. Luan Haradinaj');
INSERT INTO public.address (address_type, city, country, current_temperature, postal_code, state, street)
VALUES ('STUDENT', 'Washington', 'United States of America', null, '10000', null, 'Str. Garibaldi');
INSERT INTO public.address (address_type, city, country, current_temperature, postal_code, state, street)
VALUES ('TEACHER', 'Luxemburg', 'Luxembourg', null, '10000', null, 'Str. Mark Isaku');
INSERT INTO public.address (address_type, city, country, current_temperature, postal_code, state, street)
VALUES ('TEACHER', 'Ankara', 'Turkey', null, '10000', null, 'Str. Luan Haradinaj');
INSERT INTO public.address (address_type, city, country, current_temperature, postal_code, state, street)
VALUES ('STUDENT', 'Skopje', 'Macedonia', null, '10000', null, 'Str. Pablo Neruda');
INSERT INTO public.address (address_type, city, country, current_temperature, postal_code, state, street)
VALUES ('PARENT', 'Amsterdam', 'Netherlands', null, '10000', null, 'Str. Pjeter Bogdani');
INSERT INTO public.address (address_type, city, country, current_temperature, postal_code, state, street)
VALUES ('STUDENT', 'Islamabad', 'Pakistan', null, '10000', null, 'Str. Mark Isaku');
INSERT INTO public.address (address_type, city, country, current_temperature, postal_code, state, street)
VALUES ('PARENT', 'Moscow', 'Russia', null, '10000', null, 'Str. Garibaldi');
INSERT INTO public.address (address_type, city, country, current_temperature, postal_code, state, street)
VALUES ('TEACHER', 'Edinburgh', 'United Kingdom', null, '10000', null, 'Str. Garibaldi');
INSERT INTO public.address (address_type, city, country, current_temperature, postal_code, state, street)
VALUES ('TEACHER', 'Seoul', 'South Korea', null, '10000', null, 'Str. Pjeter Bogdani');
INSERT INTO public.address (address_type, city, country, current_temperature, postal_code, state, street)
VALUES ('STUDENT', 'Dakar', 'Senegal', null, '10000', null, 'Str. Pjeter Bogdani');
INSERT INTO public.address (address_type, city, country, current_temperature, postal_code, state, street)
VALUES ('STUDENT', 'Belgrade', 'Serbia', null, '10000', null, 'Str. Pjeter Bogdani');
INSERT INTO public.parent (birthday, email, first_name, last_name, password, phone_number, profession, status, username,
                           address_id)
VALUES ('1993-07-28', 'liridon@email.com', 'Liridon', 'Morina', '123123123', '+38345111222', 'Software Engineer',
        'ACTIVE', 'liridonmorina', 7);
INSERT INTO public.parent (birthday, email, first_name, last_name, password, phone_number, profession, status, username,
                           address_id)
VALUES ('1987-07-28', 'loresa@email.com', 'Loresa', 'Nuredini', '123123123', '+38345111222', 'Psychologist', 'ACTIVE',
        'loresanuredini', 22);
INSERT INTO public.parent (birthday, email, first_name, last_name, password, phone_number, profession, status, username,
                           address_id)
VALUES ('1970-01-01', 'fidan@email', 'Fidan', 'Bytyqi', '123123123', '123123123', 'Network Engineer', 'ACTIVE',
        'fidanbytyqi', 8);
INSERT INTO public.parent (birthday, email, first_name, last_name, password, phone_number, profession, status, username,
                           address_id)
VALUES ('1987-07-28', 'gent@email.com', 'Gent', 'Gashi', '123123123', '+38345111222', 'Architect', 'ACTIVE',
        'gentgashi', 9);
INSERT INTO public.parent (birthday, email, first_name, last_name, password, phone_number, profession, status, username,
                           address_id)
VALUES ('1970-01-01', 'nora@email', 'Nora', 'Loyd', '123123123', '123123123', 'Project Manager', 'ACTIVE', 'noraloyd',
        10);
INSERT INTO public.student (id, birthday, email, first_name, last_name, password, phone_number, status, username,
                            address_id, parent_id)
VALUES (6, '1998-01-27', 'kaya@email.com', 'Kaya', 'Bytyqi', '123123123', '0451141241', 'ACTIVE', 'kaya', 18, 3);
INSERT INTO public.student (id, birthday, email, first_name, last_name, password, phone_number, status, username,
                            address_id, parent_id)
VALUES (7, '1998-01-27', 'sara@email.com', 'Sara', 'Loyd', '123123123', '0451141241', 'ACTIVE', 'sara', 5, 4);
INSERT INTO public.student (id, birthday, email, first_name, last_name, password, phone_number, status, username,
                            address_id, parent_id)
VALUES (8, '1998-01-27', 'jenie@email.com', 'Jennie', 'Loyd', '123123123', '0451141241', 'ACTIVE', 'jennie', 20, 4);
INSERT INTO public.student (id, birthday, email, first_name, last_name, password, phone_number, status, username,
                            address_id, parent_id)
VALUES (1, '1998-01-27', 'malt@email.com', 'Malt', 'Morina', '123123123', '0451141241', 'ACTIVE', 'malt', 1, 1);
INSERT INTO public.student (id, birthday, email, first_name, last_name, password, phone_number, status, username,
                            address_id, parent_id)
VALUES (2, '1998-01-27', 'troi@email.com', 'Troi', 'Morina', '123123123', '0451141241', 'ACTIVE', 'troi', 4, 1);
INSERT INTO public.student (id, birthday, email, first_name, last_name, password, phone_number, status, username,
                            address_id, parent_id)
VALUES (3, '1998-01-27', 'lis@email.com', 'Lis', 'Nuredini', '123123123', '0451141241', 'ACTIVE', 'lis', 2, 2);
INSERT INTO public.student (id, birthday, email, first_name, last_name, password, phone_number, status, username,
                            address_id, parent_id)
VALUES (4, '1998-01-27', 'kaan@email.com', 'Kaan', 'Nuredini', '123123123', '0451141241', 'ACTIVE', 'kaan', 17, 2);
INSERT INTO public.student (id, birthday, email, first_name, last_name, password, phone_number, status, username,
                            address_id, parent_id)
VALUES (5, '1998-01-27', 'steve@email.com', 'Steve', 'Bytyqi', '123123123', '0451141241', 'ACTIVE', 'steve', 3, 3);
INSERT INTO public.teacher (id, birthday, education_level, email, first_name, last_name, password, phone_number, status,
                            username, address_id)
VALUES (1, '1972-01-06', 'MASTER', 'john@email', 'John', 'Gotti', '123123123', '123123123', 'ACTIVE', 'john', 11);
INSERT INTO public.teacher (id, birthday, education_level, email, first_name, last_name, password, phone_number, status,
                            username, address_id)
VALUES (2, '1972-01-06', 'BACHELOR', 'frank@email', 'Frank', 'Lampi', '123123123', '123123123', 'ACTIVE', 'frank', 12);
INSERT INTO public.teacher (id, birthday, education_level, email, first_name, last_name, password, phone_number, status,
                            username, address_id)
VALUES (3, '1972-01-06', 'BACHELOR', 'anna@email', 'Anna', 'Lampi', '123123123', '123123123', 'ACTIVE', 'anna', 13);
INSERT INTO public.teacher (id, birthday, education_level, email, first_name, last_name, password, phone_number, status,
                            username, address_id)
VALUES (4, '1972-01-06', 'MASTER', 'khloe@email', 'Khloe', 'Edge', '123123123', '123123123', 'ACTIVE', 'khloe', 14);
INSERT INTO public.teacher (id, birthday, education_level, email, first_name, last_name, password, phone_number, status,
                            username, address_id)
VALUES (5, '1972-01-06', 'DOCTORAL', 'jesse@email', 'Jesse', 'Knight', '123123123', '123123123', 'ACTIVE', 'jesse', 15);
INSERT INTO public.course (id, description, name)
VALUES (1,
        'It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.',
        'English');
INSERT INTO public.course (id, description, name)
VALUES (2,
        'It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.',
        'Math');
INSERT INTO public.course (id, description, name)
VALUES (3,
        'It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.',
        'French');
INSERT INTO public.course (id, description, name)
VALUES (4,
        'It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.',
        'Physics');
INSERT INTO public.course (id, description, name)
VALUES (5,
        'It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.',
        'Music');
INSERT INTO public.course (id, description, name)
VALUES (6,
        'It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.',
        'History');
INSERT INTO public.course (id, description, name)
VALUES (7,
        'It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.',
        'Geography');
INSERT INTO public.course (id, description, name)
VALUES (8,
        'It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.',
        'Biology');