# afb_web_mobile_testing
Install testNG jar file and add to IDE to avoid classNotdef error
install "npm install -g Appium"
install "Appium desktop UI"
install "npm install -g appium-doctor"
install "appium driver install uiautomator2"
install Appium inspector for windows https://github.com/appium/appium-inspector/releases/tag/v2023.10.4
install android studio

Activate sdk commandline tool

set env variable: ANDROID_HOME=C:\Users\[username]\AppData\Local\Android\Sdk, JAVA_HOME=C:\Program Files\Java\jdk-19

Add to path: C:\Users\[username]\AppData\Local\Android\Sdk\platform-tools, C:\Users\[username]\AppData\Local\Android\Sdk\emulator, C:\Users\[username]\AppData\Local\Android\Sdk\cmdline-tools\latest\bin, C:\Users\[username]\AppData\Local\Android\Sdk\emulator, %JAVA_HOME%\bin

install android emulator: sdkmanager.bat "platform-tools" "platforms;android-33"

Sart Appium with "appium" cmd
List Appium drivers "appium driver list --installed"
List emulators: "emulator -list-avds"
Start an emulator: "emulators -avd [emulator ID]

j
