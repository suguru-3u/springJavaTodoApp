CREATE ROLE appuser WITH LOGIN PASSWORD 'apppass';
GRANT SELECT,UPDATE,INSERT,DELETE ON ALL TABLES IN SCHEMA public TO appuser;
GRANT USAGE, SELECT ON ALL SEQUENCES IN SCHEMA public TO appuser;

CREATE ROLE suguru WITH LOGIN PASSWORD '13579515' SUPERUSER;