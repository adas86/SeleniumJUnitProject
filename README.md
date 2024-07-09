# Selenium WebDriver and JUnit Project

This project demonstrates how to use Selenium WebDriver with JUnit for automated testing.

## Setup Instructions

### Prerequisites
- Java Development Kit (JDK) installed
- Eclipse IDE for Java Developers
- Google Chrome browser installed
- ChromeDriver executable downloaded
- minikube running using docker driver
- frontend and backend service are deployed and accessible through http://localhost:8080/ and http://localhost:3000/greet respectively

### Step-by-Step Instructions:

1.  **Install Eclipse IDE for Java Developers:** If Eclipse is not already installed, download and install it from Eclipse Downloads.

2.  **Install Git Integration for Eclipse (EGit):** If Git integration is not already installed in Eclipse:

    -   Go to `Help > Eclipse Marketplace`.
    -   Search for `EGit` and install it.
3.  **Clone the GitHub Repository:**

    -   Open Eclipse.
    -   Go to `File > Import`.
    -   Select `Git > Projects from Git` and click `Next`.
    -   Select `Clone URI` and click `Next`.
    -   Enter the URI of the repository: `https://github.com/adas86/SeleniumJUnitProject.git`.
    -   Click `Next`.
    -   Choose the branch you want to clone (usually `main`) and click `Next`.
    -   Specify the local directory where you want to store the repository and click `Finish`.
4.  **Import the Project into Eclipse:**

    -   After cloning the repository, Eclipse will ask you to import the project.
    -   Select `Import as general project` and click `Next`.
    -   Enter the project name (it can be the same as the repository name) and click `Finish`.
5.  **Convert to Maven Project:**

    -   Right-click on the project in the Project Explorer.
    -   Select `Configure > Convert to Maven Project`.
    -   Eclipse will automatically configure the project based on the `pom.xml` file.
6.  **Update Maven Project:**

    -   Right-click on the project again.
    -   Select `Maven > Update Project`.
    -   Check `Force Update of Snapshots/Releases` and click `OK`.
7.  **Setup WebDriver Path (Chromedriver for v126 is included in the project, so perform this step only if there is error due mismatch of chrome version):**

    -   Open the test class `FrntBck` in the `src/test/java` directory.
    -   Update the WebDriver path in the `setUp` method:        
        `System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");`
    -   Replace `"path/to/chromedriver"` with the actual path to the ChromeDriver executable on your computer. You can download ChromeDriver from here.
8.  **Run the JUnit Tests:**

    -   Right-click on the test class (e.g., `FrntBck`).
    -   Select `Run As > JUnit Test`.
