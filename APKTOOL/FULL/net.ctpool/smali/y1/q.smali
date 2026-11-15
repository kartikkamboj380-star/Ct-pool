.class public final synthetic Ly1/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Ly1/r;

.field public final synthetic n:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Ly1/r;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly1/q;->m:Ly1/r;

    iput-object p2, p0, Ly1/q;->n:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Ly1/q;->m:Ly1/r;

    iget-object v1, p0, Ly1/q;->n:Ljava/lang/Runnable;

    invoke-static {v0, v1}, Ly1/r;->a(Ly1/r;Ljava/lang/Runnable;)V

    return-void
.end method
