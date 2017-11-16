# Segundo exercício da disciplina DM110 - Desenvolvimento JavaEE
## Pós Graduação em Desenvolvimento de Aplicações para Dispositivos Móveis - INATEL

### Banco de dados
```
create table client (
    id serial primary key,
    name varchar(50) not null,
    email varchar(50) not null
);

create sequence seq_client;
```

### Endpoints
`[GET] /clientes/api/client`

`[POST] /clientes/api/client/insert`

Exemplo de JSON a ser inserido no body:
```
{
	"name": "natalia",
	"email": "natalia@gmail.com"
}
```
