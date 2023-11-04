package com.monitoring.api.model.dto.message

import org.springframework.http.HttpStatus

class DeletedMessage : AbstractApiMessage(
    status = HttpStatus.OK,
    message = "Successfully deleted"
)