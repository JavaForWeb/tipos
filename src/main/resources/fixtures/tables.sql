CREATE TABLE public."City"
(
    "CityId" integer,
    "CountryId" integer,
    "RegionId" integer,
    "City" character varying(50),
    "Latitude" double precision,
    "Longitude" double precision,
    "TimeZone" character varying(10),
    "DmaId" integer,
    "CODE" character varying(10),
    PRIMARY KEY ("CityId")
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public."City"
    OWNER to postgres;
