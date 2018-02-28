## Installing Java

#### Google for "java 9 jdk download"
![Image](/images/01_Java9JDKDownload.png)
---
#### Land on the Oracle JDK Download Site
![Image](/images/02_Oracle_Site.png)
---
#### Accept License Agreement
![Image](/images/03_AcceptLicenseAgreement_Error.png)
![Image](/images/04_AcceptLicenseAgreement.png)
---
#### Download JDK for Your Specific Operating System
![Image](/images/05_Download_JDK_9.png)
---
#### Launch the Downloaded file
![Image](/images/06_DoubleClick_And_Start_Installation.png)
---
#### Java Installation Screens
![Image](/images/10_Installation_First_Screen.png)
---
![Image](/images/11_Installation_Ready_Screen.png)
---
#### Choose Defaults and Copy Install Location
![Image](/images/12_Installation_Features_Select_Screen.png)
---
![Image](/images/13_Installation_Status_Screen.png)
---
#### Choose Defaults and Copy Install Location
![Image](/images/14_Installation_Choose_Custom_Setup.png)
---
![Image](/images/15_Installation_Status_Screen.png)
---
#### Congratulations
![Image](/images/16_Congratulations.png)
---

## Verify Java and JShell Installation

#### Launch Terminal or Command Prompt
![Image](/images/21_Launch_Command_Prompt_Windows.png)
---
![Image](/images/21_Launch_Terminal_Mac.png)
---
##### Detailed Instructions
1. If you are on Windows : Open the Command Prompt window by
  * Click the Start button
  * Select All Programs -> Accessories > Command Prompt. 
  * Or use Ctrl + Esc, and type in cmd and launch up command.
2. If you are on Mac or other OS, launch up Terminal.
	* cmd + space -> Type terminal -> Press enter

#### Java Version Successful
![Image](/images/22_Java_Version_Mac.png)
---
![Image](/images/22_Java_Version_Windows.png)
---
#### JShell Version Successful
![Image](/images/23_JShell_Version_Success_Windows.png)
---
![Image](/images/24_JShell_Version_Success_Mac_1.png)
---
#### Launching JShell
![Image](/images/26_JShell_Launch_Screen.png)
---
![Image](/images/25_JShell_Example_Command.png)
---
#### Error In Launching JShell
![Image](/images/24_JShell_Version_Error.png)
---
> If you are in windows, ```java -version``` is working and ```jshell -version``` is not working, directly jump to the section ```Setting PATH environment variable in Windows```

### Troubleshooting
1.	Check if there are any pre-existing Java installs. Uninstall them and reinstall again.
2.	Temporarily turn off firewalls and antivirus software.
3.	If you get file corrupt message, download the installation file again.
4.	Check if you are on 32-bit OS or 64-bit OS. Remember, Java 9 is not supported on 32 bit windows.
5. Check if you need PATH variable to point to right Java Version - https://www.java.com/en/download/help/path.xml

### More Help
- Windows - https://docs.oracle.com/javase/9/install/installation-jdk-and-jre-microsoft-windows-platforms.htm
- Mac - https://docs.oracle.com/javase/9/install/installation-jdk-and-jre-macos.htm#JSJIG-GUID-2FE451B0-9572-4E38-A1A5-568B77B146DE
- Linux - https://docs.oracle.com/javase/9/install/installation-jdk-and-jre-linux-platforms.htm#JSJIG-GUID-737A84E4-2EFF-4D38-8E60-3E29D1B884B8


## Setting PATH environment variable in Windows

#### Goal - What we want to do?
![Image](/images/30_JShell_In_JDK_Bin_Folder.png)
---
#### More Help
- https://www.java.com/en/download/help/path.xml
- https://www.computerhope.com/issues/ch000549.htm
---

#### Browsing to Java Folder
![Image](/images/31_Browsing_To_Java_Folder.png)
---
#### Browsing to JDK Bin Folder
![Image](/images/32_Browsing_To_JDK_Bin_Folder.png)
---
#### Launch Environment Variables
Two Options
- Short Route - ```Click``` Start Button or ```Ctrl + Esc``` to launch start menu and type in ```Env```. Choose ```Edit System Environment Variables```.
- Long Route - Select ```Control Panel``` and then ```System```. Click ```Advanced``` and then ```Environment Variables```.
![Image](/images/33_Windows_Environment_Variables.png)
---
![Image](/images/34_Click_Environment_Variables.png)
---
#### Select and Edit Path Variable
![Image](/images/35_Scroll_And_Select_Path_And_Edit.png)
---
![Image](/images/36_Default_Path_value.png)
---
#### Add JDK Bin Folder To Path
![Image](/images/37_Add_JDK_Bin_Folder_To_Path.png)
---
![Image](/images/38_Click_ok.png)
---
![Image](/images/39_Click_ok.png)
---
![Image](/images/40_Click_ok.png)
---

## Installing Eclipse

Eclipse is the most popular open source Java IDE.

Choose the latest available version of Eclipse - Eclipse Oxygen (4.7) or Later.

> Tip : Do not use an old eclipse version!

### Prerequisites
- Java JDK 9

### Installation

1. Search google for “download eclipse” and choose the first result. The direct link is http://www.eclipse.org/downloads/eclipse-packages/.
![Image](/images/51_google-search-download-eclipse.png)

2. Choose the right Operation System. 
![Image](/images/52_eclipse-choose-installation.png)

3. We recommend to choose “Eclipse IDE for Java EE Developers”. Choose 32 bit or 64 bit based on your operating system. (Right-click My Computer, and then click Properties. If "x64 Edition" is listed under System, your processor is capable of running a 64-bit version of Windows.)

4. Wait for the download to complete. Extract the zip file to a folder (Example : c:\eclipse).
5. When you unzip Eclipse, the directory layout looks something like this:

```
   eclipse/
      features/			''the directory containing Eclipse features''
      plugins/			''the directory containing Eclipse plugins''
      eclipse.exe		''platform executable''
      eclipse.ini
      eclipsec.exe              ''(windows only) console executable''
      epl-v10.html		''the EPL license''
       jre/			''the JRE to run Eclipse with''
      notice.html	
      readme	
```
6. You can start Eclipse by running eclipse.exe on Windows or eclipse on other platforms. This small launcher essentially finds and loads the JVM. On Windows, the eclipsec.exe console executable can be used for improved command line behavior.

> More Details - https://wiki.eclipse.org/FAQ_How_do_I_run_Eclipse%3F

### Troubleshooting
- Use 7Zip instead of windows built-in decompression utility.
- Unzip to root folder (e.g. c:\) compared to a long directory path (e.g. c:\Program Files\Eclipse).
- Reference - https://wiki.eclipse.org/Eclipse/Installation#Troubleshooting
