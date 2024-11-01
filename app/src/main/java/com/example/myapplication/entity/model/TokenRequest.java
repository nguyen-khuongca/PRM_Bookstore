package com.example.myapplication.entity.model;

public class TokenRequest {
        private String userId;

        public TokenRequest(String userId) {
            this.userId = userId;
        }

        public String getUserId() {
            return userId;
        }
    }
