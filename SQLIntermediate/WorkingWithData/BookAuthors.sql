SELECT Books.name, Books.year, Authors.name AS author
FROM Books, Authors
WHERE Books.author_id = Authors.id
ORDER BY Authors.name, Books.year;