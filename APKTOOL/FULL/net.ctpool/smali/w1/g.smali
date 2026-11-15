.class public final synthetic Lw1/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Lw1/j;

.field public final synthetic o:LI0/d;

.field public final synthetic p:LD1/g;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lw1/j;LI0/d;LD1/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw1/g;->m:Ljava/lang/Object;

    iput-object p2, p0, Lw1/g;->n:Lw1/j;

    iput-object p3, p0, Lw1/g;->o:LI0/d;

    iput-object p4, p0, Lw1/g;->p:LD1/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lw1/g;->m:Ljava/lang/Object;

    iget-object v1, p0, Lw1/g;->n:Lw1/j;

    iget-object v2, p0, Lw1/g;->o:LI0/d;

    iget-object v3, p0, Lw1/g;->p:LD1/g;

    invoke-static {v0, v1, v2, v3}, Lw1/j;->c(Ljava/lang/Object;Lw1/j;LI0/d;LD1/g;)V

    return-void
.end method
