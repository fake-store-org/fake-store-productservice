CREATE TABLE products (
    product_id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    external_id BIGINT NOT NULL,
    title VARCHAR(255),
    price INTEGER NOT NULL,
    description TEXT,
    image TEXT,
    created_at TIMESTAMPTZ,
    updated_at TIMESTAMPTZ
);