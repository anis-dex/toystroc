insert into toy_category_entity (id, name) values ('50912b5d0db044d3b6dfac241a782507', 'LEGO');
insert into toy_category_entity (id, name) values ('e68316ddfa17478f83b0bd46e49d9ef7', 'Console de jeu');
insert into toy_category_entity (id, name) values ('2043f7febe0b4e3fbb999fe4e1779657', 'Jeu de famille');
insert into toy_category_entity (id, name) values ('77166597e9084ff486ff2afeedd28fa4', 'Jeu communauté');

insert into toys (id, name, status, category_id) values ('bbe833c484c14d3baf91070ccd89caf6', 'Lego pirate', 'AVAILABLE', '50912b5d0db044d3b6dfac241a782507');
insert into toys (id, name, status, category_id) values ('732565e2c36f4151818c7951cb440ce1', 'Lego Grue', 'AVAILABLE', '50912b5d0db044d3b6dfac241a782507');
insert into toys (id, name, status, category_id) values ('3a8e02820ec445f09d3a31469e519d95', 'Play Station 4', 'AVAILABLE', 'e68316ddfa17478f83b0bd46e49d9ef7');
insert into toys (id, name, status, category_id) values ('32bc9d543408468782f9cd5c0d04ae52', 'Monopoly', 'AVAILABLE', '2043f7febe0b4e3fbb999fe4e1779657');

insert into photo_entity (id, path) values('e67f1393d97d42e6a3fee4e5cdfd0d8a','https://upload.wikimedia.org/wikipedia/commons/d/de/Bananavarieties.jpg');
insert into photo_entity (id, path) values('d8144e9d7aa94644aba2a8834465f826','https://upload.wikimedia.org/wikipedia/commons/9/9b/Fruitbomen_en_kruiden_op_Java%2C_1596%2C_RP-P-OB-80.268.jpg');
insert into photo_entity (id, path) values('416439d243c24cd68ff46734b906b4d0','https://upload.wikimedia.org/wikipedia/commons/3/32/Sympetrum_fonscolombii%2C_female%2C_S%C3%A8te_cf04.jpg');
insert into photo_entity (id, path) values('fc58d94b63444b15b46afef358ba2612','https://upload.wikimedia.org/wikipedia/commons/f/fb/Vruchtbaarheidsbeeld_van_Artemis_van_Efeze%2C_RP-P-2018-782.jpg');

--https://upload.wikimedia.org/wikipedia/commons/a/af/Blue_1940_Chrysler%2C_Lakeshore_New_Orleans_08.jpg

insert into toys_photo_urls (toys_id, photo_urls_id) values ('bbe833c484c14d3baf91070ccd89caf6','fc58d94b63444b15b46afef358ba2612');
insert into toys_photo_urls (toys_id, photo_urls_id) values ('32bc9d543408468782f9cd5c0d04ae52','416439d243c24cd68ff46734b906b4d0');
insert into toys_photo_urls (toys_id, photo_urls_id) values ('3a8e02820ec445f09d3a31469e519d95','d8144e9d7aa94644aba2a8834465f826');
insert into toys_photo_urls (toys_id, photo_urls_id) values ('732565e2c36f4151818c7951cb440ce1','e67f1393d97d42e6a3fee4e5cdfd0d8a');
--insert into toys_tags (toys_id, tags_id) values ();