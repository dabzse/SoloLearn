SELECT students.id, students.firstname, students.lastname, teachers.lastname AS teacher
FROM students, teachers
WHERE students.teacherid = teachers.id
ORDER BY students.id;
