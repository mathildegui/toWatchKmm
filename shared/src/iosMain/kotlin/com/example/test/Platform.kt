package com.example.test

import platform.UIKit.UIDevice

actual class Platform actual constructor() {
    actual val platform: String = "YOOOOOO"
//    actual val platform: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}