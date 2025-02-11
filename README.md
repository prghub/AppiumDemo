# Mobile Automation with Appium, Java, Maven, and TestNG

## Prerequisites

Before starting, make sure you have the following tools installed on your machine:

- **Java** (JDK 8 or above)
- **Maven**
- **Appium**
- **Android Studio** (for emulator setup)
- **Node.js** (for Appium installation)
- **Git** (to clone the repository)

# Step 1: Start Appium and Emulator
## 1.1 Start Appium

## 1.2 Install SDK Manager and Set Up Emulator

To set up an Android emulator, you need the **Android SDK** and the `sdkmanager` tool, which comes with it.

### 1.3 Install Emulator and System Images

After installing the Android SDK, you need to use the `sdkmanager` to install the required components for creating and running an Android emulator.

1. Open a terminal or command prompt and run the following commands:

   ```bash
   # Update sdkmanager to get the latest versions of packages
   sdkmanager --update

   # Install Android Emulator
   sdkmanager "emulator"

   # Install required system image for the emulator (e.g., Android 11, x86)
   sdkmanager "system-images;android-30;google_apis;x86_64"

   # Install Android SDK Platform-Tools
   sdkmanager "platform-tools"

   # Install Android SDK Platforms (e.g., Android 30 for Android 11)
   sdkmanager "platforms;android-30"


# Create and Start an Android Emulator
Run the following command to create a new Android Emulator:

   ```bash
   avdmanager create avd -n "Pixel_3_API_30" -k "system-images;android-30;google_apis;x86_64"

# Start the Emulator
After creating the AVD, you can start the emulator using the following command:
emulator -avd Pixel_3_API_30
