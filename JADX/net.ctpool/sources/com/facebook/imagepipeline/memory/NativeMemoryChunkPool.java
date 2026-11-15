package com.facebook.imagepipeline.memory;

import G1.G;
import G1.H;

/* JADX INFO: loaded from: classes.dex */
@O0.d
public class NativeMemoryChunkPool extends e {
    @O0.d
    public NativeMemoryChunkPool(R0.d dVar, G g7, H h7) {
        super(dVar, g7, h7);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.memory.a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public NativeMemoryChunk f(int i7) {
        return new NativeMemoryChunk(i7);
    }
}
