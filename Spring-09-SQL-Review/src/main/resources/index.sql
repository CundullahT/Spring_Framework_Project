EXPLAIN ANALYZE
select *
from towns
where name='bd7555a25ccb6849938cc2f7e8c0d03f';

EXPLAIN ANALYZE
select *
from towns
where id='457';


CREATE INDEX idx_towns_name ON towns(name);
CREATE INDEX idx_towns_name ON towns(article);
CREATE INDEX idx_towns_name ON towns(code);

DROP INDEX IF EXISTS idx_towns_name;

SELECT
    tablename,
    indexname,
    indexdef
FROM
    pg_indexes
WHERE
        schemaname = 'public'
ORDER BY
    tablename,
    indexname;

