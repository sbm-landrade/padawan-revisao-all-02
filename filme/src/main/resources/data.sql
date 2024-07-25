CREATE TABLE filme (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255),
    diretor VARCHAR(255),
    genero VARCHAR(255),
    ano INT
);

INSERT INTO filme (titulo, diretor, genero, ano) VALUES ('O Poderoso Chefão', 'Francis Ford Coppola', 'Drama', 1972);
INSERT INTO filme (titulo, diretor, genero, ano) VALUES ('Os Bons Companheiros', 'Martin Scorsese', 'Crime', 1990);
INSERT INTO filme (titulo, diretor, genero, ano) VALUES ('Vingadores: Ultimato', 'Irmãos Russo', 'Ação', 2019);
