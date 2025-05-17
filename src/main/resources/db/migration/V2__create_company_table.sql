CREATE TABLE company (
    id UUID PRIMARY KEY,
    name TEXT NOT NULL,
    registration_number TEXT,
    website TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
