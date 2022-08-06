

CREATE TABLE payment_type
(
    payment_type integer NOT NULL,
    description character varying,
    CONSTRAINT payment_type_pkey PRIMARY KEY (payment_type)
);

CREATE TABLE IF NOT EXISTS rate_code
(
    rate_code_id integer NOT NULL,
    description character varying(255)
    CONSTRAINT rate_code_pkey PRIMARY KEY (rate_code_id)
);


CREATE TABLE IF NOT EXISTS stored_flag
(
    flag "char" NOT NULL,
    description character varying(255) 
    CONSTRAINT stored_flag_pkey PRIMARY KEY (flag)
);

CREATE TABLE IF NOT EXISTS trip_type
(
    trip_type integer NOT NULL,
    description character varying(255) 
    CONSTRAINT trip_type_pkey PRIMARY KEY (trip_type)
);

CREATE TABLE IF NOT EXISTS vendor
(
    vendor_id integer NOT NULL,
    description character varying(255) 
    CONSTRAINT vendor_pkey PRIMARY KEY (vendor_id)
);

CREATE TABLE IF NOT EXISTS zone
(
    location_id integer NOT NULL,
    borough character varying(255) 
    zone character varying(255) 
    service_zone character varying(255) 
    CONSTRAINT zone_pkey PRIMARY KEY (location_id)
);


CREATE TABLE IF NOT EXISTS trip_record
(
    vendor_id integer,
    pickup_datetime timestamp without time zone,
    dropoff_datetime timestamp without time zone,
    passenger_count integer,
    trip_distance double precision,
    pu_location_id integer,
    do_location_id integer,
    rate_code_id integer,
    store_and_fwd_flag "char",
    payment_type integer,
    fare_amount double precision,
    extra double precision,
    mta_tax double precision,
    improvement_surcharge double precision,
    tip_amount double precision,
    tolls_amount double precision,
    total_amount double precision,
    congestion_surcharge double precision,
    airport_fee double precision,
    trip_type integer,
    trip_record_id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
    CONSTRAINT trip_record_pkey PRIMARY KEY (trip_record_id),
    CONSTRAINT payment_type_fk FOREIGN KEY (payment_type)
        REFERENCES payment_type (payment_type) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID,
    CONSTRAINT rate_code_id_fk FOREIGN KEY (rate_code_id)
        REFERENCES rate_code (rate_code_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID,
    CONSTRAINT store_flag_fk FOREIGN KEY (store_and_fwd_flag)
        REFERENCES stored_flag (flag) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID,
    CONSTRAINT trip_type FOREIGN KEY (trip_type)
        REFERENCES trip_type (trip_type) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID,
    CONSTRAINT vendor_id_fk FOREIGN KEY (vendor_id)
        REFERENCES vendor (vendor_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
);