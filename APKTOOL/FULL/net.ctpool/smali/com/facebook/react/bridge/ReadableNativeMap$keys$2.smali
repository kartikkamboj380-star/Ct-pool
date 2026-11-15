.class final Lcom/facebook/react/bridge/ReadableNativeMap$keys$2;
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

    iput-object p1, p0, Lcom/facebook/react/bridge/ReadableNativeMap$keys$2;->this$0:Lcom/facebook/react/bridge/ReadableNativeMap;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lw5/l;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReadableNativeMap$keys$2;->invoke()[Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()[Ljava/lang/String;
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/facebook/react/bridge/ReadableNativeMap$keys$2;->this$0:Lcom/facebook/react/bridge/ReadableNativeMap;

    invoke-static {v0}, Lcom/facebook/react/bridge/ReadableNativeMap;->access$importKeys(Lcom/facebook/react/bridge/ReadableNativeMap;)[Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/facebook/react/bridge/ReadableNativeMap;->access$getCompanion$p()Lcom/facebook/react/bridge/ReadableNativeMap$Companion;

    invoke-static {}, Lcom/facebook/react/bridge/ReadableNativeMap;->access$getJniPassCounter$cp()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Lcom/facebook/react/bridge/ReadableNativeMap;->access$setJniPassCounter$cp(I)V

    return-object v0
.end method
