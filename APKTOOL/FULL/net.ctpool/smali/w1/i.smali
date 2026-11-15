.class public final synthetic Lw1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI0/j;


# instance fields
.field public final synthetic a:LD1/g;

.field public final synthetic b:Lw1/j;


# direct methods
.method public synthetic constructor <init>(LD1/g;Lw1/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw1/i;->a:LD1/g;

    iput-object p2, p0, Lw1/i;->b:Lw1/j;

    return-void
.end method


# virtual methods
.method public final a(Ljava/io/OutputStream;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lw1/i;->a:LD1/g;

    iget-object v1, p0, Lw1/i;->b:Lw1/j;

    invoke-static {v0, v1, p1}, Lw1/j;->a(LD1/g;Lw1/j;Ljava/io/OutputStream;)V

    return-void
.end method
