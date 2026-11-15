.class public final synthetic Lw1/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:Lw1/j;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lw1/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw1/f;->a:Ljava/lang/Object;

    iput-object p2, p0, Lw1/f;->b:Lw1/j;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lw1/f;->a:Ljava/lang/Object;

    iget-object v1, p0, Lw1/f;->b:Lw1/j;

    invoke-static {v0, v1}, Lw1/j;->d(Ljava/lang/Object;Lw1/j;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
