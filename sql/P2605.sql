select prd.name, prv.name from products prd
inner join providers prv on prv.id = prd.id_providers
where id_categories = '6';


