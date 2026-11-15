.class public final synthetic Lh4/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Lh4/A;

.field public final synthetic n:Ljava/lang/String;

.field public final synthetic o:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lh4/A;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh4/u;->m:Lh4/A;

    iput-object p2, p0, Lh4/u;->n:Ljava/lang/String;

    iput-object p3, p0, Lh4/u;->o:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lh4/u;->m:Lh4/A;

    iget-object v1, p0, Lh4/u;->n:Ljava/lang/String;

    iget-object v2, p0, Lh4/u;->o:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lh4/A;->f(Lh4/A;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
