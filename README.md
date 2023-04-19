# CollegeDetailsAPI
This project is a REST API built with Spring Boot and MySQL, which allows users to retrieve information about colleges and their courses. The application uses JPA Repository to interact with the database and retrieve data from the 'college' and 'course' tables.

The 'college' table contains information such as the name of the college, the course name, course fee, duration of the course, and accommodation details. The 'course' table contains information about the courses, including the course ID, course name, and course fee.

The API provides two endpoints: one to retrieve a list of all colleges and their associated details, and another to retrieve information about a specific college and its associated courses. The college details are retrieved by joining the 'college' and 'course' tables on the course ID.

This API can be used by anyone who needs to retrieve information about colleges and their courses, such as prospective students, education consultants, and academic researchers. It can also serve as a foundation for building more complex education-related applications, such as college search engines or course recommendation systems.
