ALTER TABLE cities
ADD AttractivePlace VARCHAR(255);

UPDATE cities
SET AttractivePlace = 'Belem Tower'
WHERE name = 'Lisbon';

UPDATE cities
SET AttractivePlace = 'Plaza Mayor'
WHERE name = 'Madrid';

UPDATE cities
SET AttractivePlace = 'Eiffel Tower'
WHERE name = 'Paris';

SELECT * FROM cities;
