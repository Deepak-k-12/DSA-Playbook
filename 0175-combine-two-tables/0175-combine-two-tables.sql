select firstName,lastName,city,state
from Person
Left join Address
on person.personId = Address.personId