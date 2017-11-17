/*
 * FFmpeg is free software...
 */

#include <stdatomic.h>
#include <string.h>

#include "thread.h"

AVBufferRef *create(uint8_t *data, ...
{
    AVBufferRef *ref = NULL;
    AVBuffer    *buf = NULL;

    buf = av_mallocz(sizeof(*buf));
    if (!buf) {
        return NULL;
    }
    buf->data     = data;
    buf->size     = size;
    buf->opaque   = opaque;

    atomic_init(&buf->refcount, 1);
    ...
}
