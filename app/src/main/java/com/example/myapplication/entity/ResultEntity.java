package com.example.myapplication.entity;

import java.util.List;

public class ResultEntity<T> {
    private T value;
    private int status;
    private boolean isSuccess;
    private String successMessage;
    private String correlationId;
    private String location;
    private List<String> errors;
    private List<String> validationErrors;

    public ResultEntity(T value,
                        int status,
                        boolean isSuccess,
                        String successMessage,
                        String correlationId,
                        String location,
                        List<String> errors,
                        List<String> validationErrors) {
        this.value = value;
        this.status = status;
        this.isSuccess = isSuccess;
        this.successMessage = successMessage;
        this.correlationId = correlationId;
        this.location = location;
        this.errors = errors;
        this.validationErrors = validationErrors;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getSuccessMessage() {
        return successMessage;
    }

    public void setSuccessMessage(String successMessage) {
        this.successMessage = successMessage;
    }

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }

    public List<String> getValidationErrors() {
        return validationErrors;
    }

    public void setValidationErrors(List<String> validationErrors) {
        this.validationErrors = validationErrors;
    }
}
