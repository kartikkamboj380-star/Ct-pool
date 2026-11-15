.class public final synthetic Lcom/facebook/react/N;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final synthetic m:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/N;->m:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/N;->m:Ljava/util/List;

    invoke-static {v0}, Lcom/facebook/react/O;->a(Ljava/util/List;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
