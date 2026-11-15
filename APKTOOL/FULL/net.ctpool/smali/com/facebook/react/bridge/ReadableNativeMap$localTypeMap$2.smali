.class final Lcom/facebook/react/bridge/ReadableNativeMap$localTypeMap$2;
.super Lw5/l;
.source "SourceFile"

# interfaces
.implements Lv5/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/bridge/ReadableNativeMap;-><init>(Lcom/facebook/jni/HybridData;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lw5/l;",
        "Lv5/a;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/bridge/ReadableNativeMap;


# direct methods
.method constructor <init>(Lcom/facebook/react/bridge/ReadableNativeMap;)V
    .locals 0

    iput-object p1, p0, Lcom/facebook/react/bridge/ReadableNativeMap$localTypeMap$2;->this$0:Lcom/facebook/react/bridge/ReadableNativeMap;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lw5/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReadableNativeMap$localTypeMap$2;->invoke()Ljava/util/HashMap;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Ljava/util/HashMap;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/facebook/react/bridge/ReadableType;",
            ">;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/facebook/react/bridge/ReadableNativeMap$localTypeMap$2;->this$0:Lcom/facebook/react/bridge/ReadableNativeMap;

    invoke-static {v0}, Lcom/facebook/react/bridge/ReadableNativeMap;->access$getKeys(Lcom/facebook/react/bridge/ReadableNativeMap;)[Ljava/lang/String;

    move-result-object v0

    array-length v0, v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1, v0}, Ljava/util/HashMap;-><init>(I)V

    iget-object v2, p0, Lcom/facebook/react/bridge/ReadableNativeMap$localTypeMap$2;->this$0:Lcom/facebook/react/bridge/ReadableNativeMap;

    invoke-static {v2}, Lcom/facebook/react/bridge/ReadableNativeMap;->access$importTypes(Lcom/facebook/react/bridge/ReadableNativeMap;)[Ljava/lang/Object;

    move-result-object v2

    invoke-static {}, Lcom/facebook/react/bridge/ReadableNativeMap;->access$getCompanion$p()Lcom/facebook/react/bridge/ReadableNativeMap$Companion;

    invoke-static {}, Lcom/facebook/react/bridge/ReadableNativeMap;->access$getJniPassCounter$cp()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    invoke-static {v3}, Lcom/facebook/react/bridge/ReadableNativeMap;->access$setJniPassCounter$cp(I)V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_0

    iget-object v4, p0, Lcom/facebook/react/bridge/ReadableNativeMap$localTypeMap$2;->this$0:Lcom/facebook/react/bridge/ReadableNativeMap;

    invoke-static {v4}, Lcom/facebook/react/bridge/ReadableNativeMap;->access$getKeys(Lcom/facebook/react/bridge/ReadableNativeMap;)[Ljava/lang/String;

    move-result-object v4

    aget-object v4, v4, v3

    aget-object v5, v2, v3

    const-string v6, "null cannot be cast to non-null type com.facebook.react.bridge.ReadableType"

    invoke-static {v5, v6}, Lw5/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Lcom/facebook/react/bridge/ReadableType;

    invoke-interface {v1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method
