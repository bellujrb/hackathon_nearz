FROM ubuntu:20.04

RUN apt-get update \
    && apt-get install -y nodejs npm \
    && apt-get clean \
    && rm -rf /var/lib/apt/lists/*

COPY . /app

WORKDIR /app

RUN npm install

RUN forge script script/deploy.local.s.sol:Local --rpc-url http://127.0.0.1:8545 --build-info --broadcast --verbosity

RUN npm run build:compile

CMD [ "npm", "run", "app" ]