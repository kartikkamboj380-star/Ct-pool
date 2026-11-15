.class public final synthetic Lh4/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Lh4/c0;

.field public final synthetic n:Lk4/F$e$d;

.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:Z


# direct methods
.method public synthetic constructor <init>(Lh4/c0;Lk4/F$e$d;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh4/a0;->m:Lh4/c0;

    iput-object p2, p0, Lh4/a0;->n:Lk4/F$e$d;

    iput-object p3, p0, Lh4/a0;->o:Ljava/lang/String;

    iput-boolean p4, p0, Lh4/a0;->p:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lh4/a0;->m:Lh4/c0;

    iget-object v1, p0, Lh4/a0;->n:Lk4/F$e$d;

    iget-object v2, p0, Lh4/a0;->o:Ljava/lang/String;

    iget-boolean v3, p0, Lh4/a0;->p:Z

    invoke-static {v0, v1, v2, v3}, Lh4/c0;->a(Lh4/c0;Lk4/F$e$d;Ljava/lang/String;Z)V

    return-void
.end method
