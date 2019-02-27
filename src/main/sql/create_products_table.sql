CREATE TABLE products (
    id SERIAL UNIQUE,
    name TEXT NOT NULL UNIQUE,
    price MONEY NOT NULL,
    count INTEGER NOT NULL
);

ALTER TABLE products ADD CONSTRAINT price_non_negative CHECK (price > CAST(0 as MONEY));
ALTER TABLE products ADD CONSTRAINT count_non_negative CHECK (count >= 0);
