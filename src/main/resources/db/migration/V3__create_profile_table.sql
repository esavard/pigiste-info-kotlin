CREATE TABLE profile (
    id UUID PRIMARY KEY,
    user_id UUID NOT NULL REFERENCES app_user(id),
    type TEXT NOT NULL CHECK (type IN ('PIGIST', 'CLIENT')),
    bio TEXT,
    availability TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
