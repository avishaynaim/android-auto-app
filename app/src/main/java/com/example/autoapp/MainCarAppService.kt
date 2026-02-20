package com.example.autoapp

import androidx.car.app.CarAppService
import androidx.car.app.Session
import androidx.car.app.validation.HostValidator

class MainCarAppService : CarAppService() {

    override fun createHostValidator(): HostValidator {
        // Allow all hosts for development; restrict in production
        return HostValidator.ALLOW_ALL_HOSTS_VALIDATOR
    }

    override fun onCreateSession(): Session {
        return MainSession()
    }
}
