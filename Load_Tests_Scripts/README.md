
# Gatling Load Testing Scripts for MICROSERVICE Version

This archive contains scripts and programs enabling users to launch and analyze Gatling load tests for the MICROSERVICE and MONOLITH version of the application. Currently, the scripts are set up to load test the MICROSERVICE version, but can be easily adapted to the MONOLITH version.

## I. Getting the Application

### 1. Obtaining Docker Images

To obtain the necessary Docker images for running both MONOLITH and MICROSERVICE versions of the application (without the frontend part), visit the Docker Hub page listing the necessary containers:

[ICWS24Submission on Docker Hub](https://hub.docker.com/search?q=icws24submission)

Sample configuration files (`variables.env` and `docker-compose.yml`) are provided on the Docker Hub page for reference:

[ICWS24Submission Postgres Image](https://hub.docker.com/r/icws24submission/postgres_icws24)

### 2. Customization and Setup

1. Customize the provided samples (`variables.env` and `docker-compose.yml`) according to your infrastructure requirements. Place the resulting files in the `~/app/ms/` directory (this path is assumed by the scripts running the tests).
   
2. For each service defined in your `docker-compose.yml` file, pull the respective container from Docker Hub using the `docker compose pull service` command (replace `service` with the appropriate name).
   
3. Create the Docker network used by the application (refer to instructions on the Docker Hub web page).
   
4. Start the application by running the command: `docker compose up`.

## II. Running Load Tests

Once the application is set up and running, load tests can be launched using Gatling.

### 1. Gatling Installation

1. Download and install Gatling version 3.9.0 (that used for tests reported in the paper).
   
2. Place the `user-files` directory at the root of the Gatling directory.

### 2. Configuration

1. Copy the scripts from the `bin` directory accompanying this README file into the `bin` directory of the installed Gatling.
   
2. In `scale.sh` and `restart.sh`, specify the IP address of the machine where the application is installed (default is `192.168.3.136`). Also update the IP address in the Java file located in `user-files/simulations/LoadTestMicroservice.java` (or in `user-files/simulations/LoadTestMonolith.java` for the monolith version of the app)

### 3. Launching Load Tests

To launch the load tests, execute the `run.sh` script located in the Gatling `bin` directory. You can customize the `run.sh` file to adjust the configuration settings.

Gatling produces result files in a sub-directory of the `results` directory at the root of Gatling's directory. These files include an `index.html` file that can be opened in a browser for an in-depth graphical display of the results.

### Additional Statistics Analysis

For further statistics analysis, you can utilize the open-source tool available at:

[Gatling Report Tool](https://github.com/nuxeo/gatling-report)

This tool was used to obtain data indicated in the tables of the paper.

