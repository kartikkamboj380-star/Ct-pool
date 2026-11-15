.class public final synthetic Lh4/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Lh4/A;

.field public final synthetic n:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lh4/A;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh4/t;->m:Lh4/A;

    iput-object p2, p0, Lh4/t;->n:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lh4/t;->m:Lh4/A;

    iget-object v1, p0, Lh4/t;->n:Ljava/lang/String;

    invoke-static {v0, v1}, Lh4/A;->c(Lh4/A;Ljava/lang/String;)V

    return-void
.end method
