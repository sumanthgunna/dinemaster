create table restaurant(
        id INT PRIMARY KEY AUTO_INCREMENT,
        name VARCHAR(255),
        address VARCHAR(255),
        cuisineType VARCHAR(255),
        rating INT 
);

create table chef (
    id INT PRIMARY KEY AUTO_INCREMENT,
    firstName VARCHAR(255),
    lastName VARCHAR(255),
    expertise VARCHAR(255),
    experienceYears INT,
    restaurantId INT,
    FOREIGN KEY(restaurantId) REFERENCES restaurant(id);
);