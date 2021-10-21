create schema university;
create table university.student
(
    student_id             bigserial constraint student_pk primary key,
    fio_student            varchar(256) not null,
    specification_student text         not null,
    course         int          not null
);

comment on table university.student is 'Таблица студентов';
comment on column university.student.student_id is 'Уникальный идентификатор';
comment on column university.student.fio_student is 'Фамилия Имя Отчество студента';
comment on column university.student.specification_student is 'Специальность студента';
comment on column university.student.course is 'Курс обучения студента';

create table university.teacher
(
    teacher_id bigserial
        constraint teacher_pk
            primary key,
    fio_teacher varchar(256) not null,
    department_teacher text not null
);

comment on column university.teacher.teacher_id is 'Уникальный идентификатор';
comment on column university.teacher.fio_teacher is 'Фамилия Имя Отчество преподавателя';
comment on column university.teacher.department_teacher is 'Кафедра преподавателя';

create table university.teacher_student_link
(
    teacher_id bigint not null,
    student_id bigint not null,
    foreign key (teacher_id) references university.teacher(teacher_id),
    foreign key (student_id) references university.student(student_id)

);

comment on column university.teacher_student_link.teacher_id is 'Уникальный идентификатор преподавателя';
comment on column university.teacher_student_link.student_id is 'Уникальный идентификатор студента';