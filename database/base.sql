INSERT INTO equipe (id_equipe, nom_equipe) VALUES
       (1, 'Lakers'),
       (2, 'Warriors'),
       (3, 'Nets'),
       (4, 'Bucks');

insert into joueur values
    (1,'Lebron',1),
    (2,'Curry',2),
    (3, 'Durant',2),
    (4, 'Harden',3),
    (5, 'Antetokounmpo',4);


insert into action values
    (1,'Passe',0),
    (2,'T1',1),
    (3,'T2',2),
    (4,'T3',3),
    (5,'TR',0),
    (6,'RO',0),
    (7,'RD',0),
    (8,'LFRE',0),
    (9,'LFRA',0),
    (10,'desactive',0);




INSERT INTO saison (id_saison, nom_saison) VALUES 
    (1, '2021-2022'),
    (2, '2022-2023'),
    (3, '2023-2024');

INSERT INTO terrain (id_terrain, nom_terrain, localisation) VALUES 
    (1, 'Staples Center', 'Los Angeles'),
    (2, 'Chase Center', 'San Francisco'),
    (3, 'Barclays Center', 'Brooklyn');

INSERT INTO match (id_match, date_heure_debut, date_heure_fin, nom_match, id_saison, id_terrain) VALUES 
    (1, '2023-01-01 18:00:00', '2023-01-01 20:00:00', 'Lakers vs Warriors', 1, 1),
    (2, '2023-01-02 19:30:00', '2023-01-02 21:30:00', 'Nets vs Bucks', 1, 3),
    (3, '2023-01-03 17:45:00', '2023-01-03 19:45:00', 'Clippers vs Suns', 1, 1);

INSERT INTO match_jouer (id, id_equipe1, id_equipe2, id_match) VALUES 
    (1, 1, 2, 1),
    (2, 3, 4, 2),
    (3, 1, 3, 3);


INSERT INTO statistique (id_stat, temps, id_action, id_joueur, id_match) VALUES 
    (1, 5.0, 1, 1, 1),    -- Lebron effectue une passe dans le match Lakers vs Warriors
    (2, 8.5, 2, 2, 1),    -- Curry réussit un tir à 2 points dans le même match
    (3, 12.15, 3, 3, 2),  -- Durant réussit un tir à 3 points dans le match Nets vs Bucks
    (4, 15.45, 5, 4, 2),  -- Harden prend un rebond offensif dans le même match
    (5, 20.0, 6, 5, 3),   -- Antetokounmpo prend un rebond défensif dans le match Clippers vs Suns
    (6, 23.3, 7, 1, 3),   -- Lebron prend un rebond défensif dans le même match
    (7, 27.45, 8, 2, 1),  -- Curry réussit un lancer franc dans le match Lakers vs Warriors
    (8, 32.1, 9, 3, 2),   -- Durant réussit un lancer franc dans le match Nets vs Bucks
    (9, 35.25, 10, 4, 3); -- Harden est désactivé dans le match Clippers vs Suns

