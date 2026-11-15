.class public final synthetic Lw1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:Lw1/j;

.field public final synthetic c:LI0/d;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lw1/j;LI0/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw1/h;->a:Ljava/lang/Object;

    iput-object p2, p0, Lw1/h;->b:Lw1/j;

    iput-object p3, p0, Lw1/h;->c:LI0/d;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lw1/h;->a:Ljava/lang/Object;

    iget-object v1, p0, Lw1/h;->b:Lw1/j;

    iget-object v2, p0, Lw1/h;->c:LI0/d;

    invoke-static {v0, v1, v2}, Lw1/j;->b(Ljava/lang/Object;Lw1/j;LI0/d;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
