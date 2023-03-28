<div>
  <h3 align="center"> Club Register </h3>

  <p align="center">
    A Martial Arts Club Register, coded in Java.
    <br />
  </p>
  <p align="center">
    Completed: August 2020
    <br />
  </p>
</div>


<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#screenshots">Screenshots</a>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## Screenshots

<p align="center"><strong>Login</strong></p>
<p align="center"><img src="/screenshots/ma_club_login.png"></p>

|    **Register Coaches**    |     **Register Students**    |
:---------------------------:|:----------------------------:|
![2-register_coaches](/screenshots/register_coach.png) | ![3-register_students](/screenshots/register_student.png)  |

|    **Registered Coaches**    |     **Registered Students**    |
:----------------:|:-------------------------:
![2-registered_coaches](/screenshots/registered_coaches.png) | ![3-registered_students](/screenshots/registered_students.png)  |

## About The Project

This application is a Martial Arts Club Register, coded in Java. It allows the user to register students and coaches 
and the display their details. 
The user has to log in, and the data they create is saved in a database.



### Built With

* Java


<!-- GETTING STARTED -->
## Getting Started

To get this app running on your machine, simply clone the repository and run the project.

### Prerequisites

The following programs were used for the development of this project:
* Java
* XAMPP Control Panel v3.2.4 (for MySQL database)


### Installation

1. Clone the repo
   ```sh
   git clone https://github.com/GituMbugua/ma-club.git
   ```
2. Change the following lines
   ```
   String database = "jdbc:mysql://localhost:3306/<database_name>";
   con = DriverManager.getConnection(database, "<user-name>", "<password>");
   ```
3. Create the following tables in your database
   ```
   CREATE TABLE users(id int primary key not null, username varchar, password varchar);
   CREATE TABLE coaches(fname varchar, sname varchar, gender varchar, address varchar, phone varchar, discipline varchar, salary double);
   CREATE TABLE students(fname varchar, sname varchar, gender varchar, age int, phone varchar, course varchar, year varchar, geup varchar, tkbelt varchar, style varchar, kyu varchar, karbelt varchar);


<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE.txt` for more information.


<!-- CONTACT -->
## Contact

Gitu Mbugua - gmbugua38@gmail.com

Project Link: [https://github.com/GituMbugua/ma-club](https://github.com/GituMbugua/ma-club)

<p align="right">(<a href="#readme-top">back to top</a>)</p>
