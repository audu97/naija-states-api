package com.naijaState.plugins

import com.naijaState.routes.stateRouting
import io.ktor.server.routing.*
import io.ktor.server.application.*


fun Application.configureRouting() {

    routing {
       stateRouting()
    }
}
