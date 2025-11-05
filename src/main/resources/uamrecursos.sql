-- ===========================================================
-- 1. TABLA: Rol
-- ===========================================================
CREATE TABLE Rol (
                     id_rol INT AUTO_INCREMENT PRIMARY KEY,
                     nombre_rol ENUM('Administrador', 'Moderador', 'Estudiante') NOT NULL,
                     descripcion VARCHAR(255)
);

-- ===========================================================
-- 2. TABLA: Usuario
-- ===========================================================
CREATE TABLE Usuario (
                         id_usuario INT AUTO_INCREMENT PRIMARY KEY,
                         nombre VARCHAR(100) NOT NULL,
                         apellidos VARCHAR(100) NOT NULL,
                         correo_institucional VARCHAR(150) NOT NULL UNIQUE,
                         contraseña_hash VARCHAR(255) NOT NULL,
                         trimestre_actual VARCHAR(20),
                         area_interes VARCHAR(100),
                         id_rol INT NOT NULL,
                         fecha_registro DATETIME DEFAULT CURRENT_TIMESTAMP,
                         FOREIGN KEY (id_rol) REFERENCES Rol(id_rol)
                             ON UPDATE CASCADE ON DELETE RESTRICT
);

-- ===========================================================
-- 3. TABLA: Materia
-- ===========================================================
CREATE TABLE Materia (
                         id_materia INT AUTO_INCREMENT PRIMARY KEY,
                         nombre_materia VARCHAR(150) NOT NULL,
                         descripcion TEXT,
                         area_asociada VARCHAR(100)
);

-- ===========================================================
-- 4. TABLA: Tema
-- ===========================================================
CREATE TABLE Tema (
                      id_tema INT AUTO_INCREMENT PRIMARY KEY,
                      nombre_tema VARCHAR(150) NOT NULL,
                      descripcion TEXT,
                      id_materia INT,
                      FOREIGN KEY (id_materia) REFERENCES Materia(id_materia)
                          ON UPDATE CASCADE ON DELETE SET NULL
);