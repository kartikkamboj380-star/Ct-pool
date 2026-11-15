.class public final Lcom/facebook/react/bridge/ReadableNativeMap$keySetIterator$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/bridge/ReadableMapKeySetIterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/bridge/ReadableNativeMap;->keySetIterator()Lcom/facebook/react/bridge/ReadableMapKeySetIterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $iteratorKeys:[Ljava/lang/String;

.field private currentIndex:I


# direct methods
.method constructor <init>([Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/bridge/ReadableNativeMap$keySetIterator$1;->$iteratorKeys:[Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getCurrentIndex()I
    .locals 1

    iget v0, p0, Lcom/facebook/react/bridge/ReadableNativeMap$keySetIterator$1;->currentIndex:I

    return v0
.end method

.method public hasNextKey()Z
    .locals 2

    iget v0, p0, Lcom/facebook/react/bridge/ReadableNativeMap$keySetIterator$1;->currentIndex:I

    iget-object v1, p0, Lcom/facebook/react/bridge/ReadableNativeMap$keySetIterator$1;->$iteratorKeys:[Ljava/lang/String;

    array-length v1, v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public nextKey()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/facebook/react/bridge/ReadableNativeMap$keySetIterator$1;->$iteratorKeys:[Ljava/lang/String;

    iget v1, p0, Lcom/facebook/react/bridge/ReadableNativeMap$keySetIterator$1;->currentIndex:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/facebook/react/bridge/ReadableNativeMap$keySetIterator$1;->currentIndex:I

    aget-object v0, v0, v1

    return-object v0
.end method

.method public final setCurrentIndex(I)V
    .locals 0

    iput p1, p0, Lcom/facebook/react/bridge/ReadableNativeMap$keySetIterator$1;->currentIndex:I

    return-void
.end method
