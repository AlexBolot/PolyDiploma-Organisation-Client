#!/bin/bash

# the image will be removed when stopped
docker run --rm -it -v `pwd`:/host team-e/polydiploma-client-organisation

# ^C to stop
