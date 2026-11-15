.class public final synthetic La3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:La3/c;

.field public final synthetic n:LU2/p;

.field public final synthetic o:LS2/k;

.field public final synthetic p:LU2/i;


# direct methods
.method public synthetic constructor <init>(La3/c;LU2/p;LS2/k;LU2/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La3/a;->m:La3/c;

    iput-object p2, p0, La3/a;->n:LU2/p;

    iput-object p3, p0, La3/a;->o:LS2/k;

    iput-object p4, p0, La3/a;->p:LU2/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, La3/a;->m:La3/c;

    iget-object v1, p0, La3/a;->n:LU2/p;

    iget-object v2, p0, La3/a;->o:LS2/k;

    iget-object v3, p0, La3/a;->p:LU2/i;

    invoke-static {v0, v1, v2, v3}, La3/c;->c(La3/c;LU2/p;LS2/k;LU2/i;)V

    return-void
.end method
