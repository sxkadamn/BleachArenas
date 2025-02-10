**BleachArenas - Compilation Guide**

Prerequisites

Before compiling BleachArenas, ensure you have the following prerequisites installed on your system:

JDK 16 or later

Maven

BuildTools

Getting BuildTools

Download BuildTools.

Generate the complete Spigot JAR for various versions using the following command:

java -jar BuildTools.jar --rev 1.17.1

Execute this operation for the following versions: 1.17.1, 1.18.2, 1.19.4, 1.20.1, 1.20.2, 1.20.4.

Compiling BleachArenas

Clone this repository to your local machine:

git clone https://github.com/sxkadamn/BleachArenas.git

Navigate to the project directory:

cd BleachArenas

Run the following Maven command to clean and install the project:

mvn clean install

Usage

After successfully compiling BleachArenas, you can use the generated JAR file in your Spigot server plugin directory.

Contributing

Feel free to contribute to the development of BleachArenas by submitting issues or pull requests.

License

This project is licensed under the MIT License.
