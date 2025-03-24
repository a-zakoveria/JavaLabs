CREATE DATABASE universitybd;
USE universitybd;
CREATE TABLE Students (
                          ID INT PRIMARY KEY AUTO_INCREMENT,    -- Унікальний ID
                          first_name VARCHAR(50),                -- Ім'я
                          last_name VARCHAR(50),                 -- Прізвище
                          middle_name VARCHAR(50),               -- По батькові
                          birth_date DATE,                       -- Дата народження
                          student_card_number VARCHAR(50)        -- Номер залікової книжки
);
INSERT INTO Students (first_name, last_name, middle_name, birth_date, student_card_number)
VALUES
    ('Tomas', 'Jonson', 'Petrovich', '2003-01-15', '12345'),
    ('Anna', 'Zakoverya', 'Sergeyevna', '2003-02-20', '12346'),
    ('Olga', 'Lukina', 'Vladimirovna', '2003-03-25', '12347'),
    ('Petr', 'Ivanov', 'Mikhailovich', '2003-04-10', '12348'),
    ('Natalia', 'Zaytseva', 'Borisivna', '2003-05-05', '12349'),
    ('Igor', 'Goncharov', 'Dmitrievich', '2003-07-12', '12350'),
    ('Svetlana', 'Vasilenko', 'Ivanivna', '2003-08-22', '12351'),
    ('Sergey', 'Smirnov', 'Alexeyevich', '2003-09-30', '12352'),
    ('Julia', 'Kozlova', 'Pavlivna', '2003-10-11', '12353'),
    ('Egor', 'Morozov', 'Leonidovich', '2003-11-05', '12354'),
    ('Vera', 'Petrova', 'Sergeyevna', '2004-01-22', '12355'),
    ('Maxim', 'Novikov', 'Yurievich', '2004-02-12', '12356'),
    ('Anastasia', 'Ivanova', 'Olegivna', '2004-03-10', '12357'),
    ('Oleg', 'Kuznetsov', 'Alekseyevich', '2004-04-05', '12358'),
    ('Elena', 'Klimenko', 'Sergeyevna', '2004-05-15', '12359'),
    ('Dmitry', 'Sokolov', 'Valeryevich', '2004-08-02', '12360'),
    ('Artem', 'Fedorov', 'Maksymovych', '2004-07-25', '12361'),
    ('Nina', 'Chekhovskaya', 'Viktorivna', '2004-08-08', '12362'),
    ('Alexey', 'Korolev', 'Vladimirovich', '2004-09-17', '12363'),
    ('Irina', 'Belova', 'Igorevna', '2004-10-20', '12364'),
    ('Vladimir', 'Popov', 'Evgenievich', '2004-11-03', '12365');