INSERT INTO public.user (id, username, password) VALUES (DEFAULT, 'Priit', 'priit');
INSERT INTO public.user (id, username, password) VALUES (DEFAULT, 'Liis', 'liis');

INSERT INTO public.currency (id, name) VALUES (DEFAULT, 'EUR');
INSERT INTO public.currency (id, name) VALUES (DEFAULT, 'USD');
INSERT INTO public.currency (id, name) VALUES (DEFAULT, 'NOK');
INSERT INTO public.currency (id, name) VALUES (DEFAULT, 'SEK');
INSERT INTO public.currency (id, name) VALUES (DEFAULT, 'GBP');

INSERT INTO public.account (id, user_id, name) VALUES (DEFAULT, 1, 'LHV konto');
INSERT INTO public.account (id, user_id, name) VALUES (DEFAULT, 1, 'SEB konto');
INSERT INTO public.account (id, user_id, name) VALUES (DEFAULT, 1, 'SWED konto');
INSERT INTO public.account (id, user_id, name) VALUES (DEFAULT, 2, 'investeerimiskonto 1');

INSERT INTO public.transaction (id, currency_id, account_id, date, ticker, type, price, amount, fee, tax) VALUES (DEFAULT, 1, 1, '2022-12-17', 'XXX', 'DIV', 10.00, 100, 0.20, 1.00);
INSERT INTO public.transaction (id, currency_id, account_id, date, ticker, type, price, amount, fee, tax) VALUES (DEFAULT, 1, 1, '2022-12-17', 'XXX', 'DIV', 5.00, 100, 0.20, 1.00);
INSERT INTO public.transaction (id, currency_id, account_id, date, ticker, type, price, amount, fee, tax) VALUES (DEFAULT, 2, 1, '2022-12-17', 'XXX', 'SELL', 9.00, 100, 0.20, 1.00);
INSERT INTO public.transaction (id, currency_id, account_id, date, ticker, type, price, amount, fee, tax) VALUES (DEFAULT, 2, 2, '2022-12-17', 'XXX', 'SELL', 8.00, 10, 0.20, 1.00);
INSERT INTO public.transaction (id, currency_id, account_id, date, ticker, type, price, amount, fee, tax) VALUES (DEFAULT, 3, 2, '2022-12-17', 'XXX', 'SELL', 8.00, 100, 0.20, 1.00);
INSERT INTO public.transaction (id, currency_id, account_id, date, ticker, type, price, amount, fee, tax) VALUES (DEFAULT, 3, 2, '2022-12-17', 'XXX', 'BUY', 8.00, 100, 0.20, 1.00);
INSERT INTO public.transaction (id, currency_id, account_id, date, ticker, type, price, amount, fee, tax) VALUES (DEFAULT, 4, 3, '2022-12-17', 'XXX', 'BUY', 4.00, 100, 0.20, 1.00);
INSERT INTO public.transaction (id, currency_id, account_id, date, ticker, type, price, amount, fee, tax) VALUES (DEFAULT, 5, 4, '2022-12-17', 'XXX', 'BUY', 3.00, 100, 0.20, 1.00);
INSERT INTO public.transaction (id, currency_id, account_id, date, ticker, type, price, amount, fee, tax) VALUES (DEFAULT, 5, 2, '2022-12-17', 'XXX', 'BUY', 4.00, 100, 0.20, 1.00);
INSERT INTO public.transaction (id, currency_id, account_id, date, ticker, type, price, amount, fee, tax) VALUES (DEFAULT, 5, 3, '2022-12-17', 'XXX', 'BUY', 6.00, 100, 0.20, 1.00);
INSERT INTO public.transaction (id, currency_id, account_id, date, ticker, type, price, amount, fee, tax) VALUES (DEFAULT, 1, 3, '2022-12-17', 'XXX', 'DIV', 8.00, 100, 0.20, 1.00);
INSERT INTO public.transaction (id, currency_id, account_id, date, ticker, type, price, amount, fee, tax) VALUES (DEFAULT, 4, 3, '2022-12-17', 'XXX', 'DIV', 12.00, 10, 0.20, 1.00);


